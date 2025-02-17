# kt-telegram-bot

[![](https://jitpack.io/v/KurenaiRyu/kt-telegram-bot.svg)](https://jitpack.io/#KurenaiRyu/kt-telegram-bot)

Convenient way to build Telegram bots using powerful Kotlin language.
Support for [Telegram Bot API 6.5](https://core.telegram.org/bots/api).
Method names are the same as in [API](https://core.telegram.org/bots/api#available-methods).

## Changelog

### Version 2.2.0
- Update Bot API to 6.5

### Version 2.1.8
- fix issue #56

### Version 2.1.7
- Update Bot API to 6.2
- fix InputMedia(#54) and BotCommandScope (de)serialization

[Changelog history](./CHANGELOG.md)

## Getting started

### Prerequisites
- JDK 8 or higher
- Kotlin 1.3 or higher
- Gradle
- IDE (*optionally*)

### Installation

Gradle

```groovy
repositories {
    maven { url "https://jitpack.io" }
}

dependencies {
    implementation "com.github.kurenairyu:kt-telegram-bot:$version"
}
```

Or Gradle Kotlin DSL

```kotlin
repositories {
    maven("https://jitpack.io")
}

dependencies {
    implementation("com.github.kurenairyu:kt-telegram-bot:${version}")
}
```

Maven
```xml
<repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
</repository>

<dependency>
    <groupId>com.github.kurenairyu</groupId>
    <artifactId>kt-telegram-bot</artifactId>
    <version>{version}</version>
</dependency>
```

## Quick start

```kotlin
fun main(args: Array<String>) {
    val token = "<TOKEN>"
    val bot = Bot.createPolling(token)
    bot.onCommand("/start") { msg, _ ->
        bot.sendMessage(msg.chat.id, "Hello World!")
    }
    bot.start()
}
```

#### Chain
It is common case when you need to ask the user several questions sequentially and process user errors. Now you can
create such chains easily. Sea the example below. Do not forget to call `build()` method at the end.

```kotlin
fun main() {
    val token = "<TOKEN>"
    val username = "<BOT USERNAME>"
    val bot = Bot.createPolling(username, token)

    bot.chain("/start") { msg -> bot.sendMessage(msg.chat.id.toChatId(), "Hi! What is your name?") }
        .then { msg -> bot.sendMessage(msg.chat.id.toChatId(), "Nice to meet you, ${msg.text}! Send something to me") }
        .then { msg -> bot.sendMessage(msg.chat.id.toChatId(), "Fine! See you soon") }
        .build()

    bot.chain(
        label = "location_chain",
        predicate = { msg -> msg.location != null },
        action = { msg ->
            bot.sendMessage(
                msg.chat.id.toChatId(),
                "Fine, you've sent me a location. Confirm the order?(yes|no)"
            )
        })
        .then("answer_choice") { msg ->
            when (msg.text) {
                "yes" -> bot.jumpToAndFire("order_taxi", msg)
                "no" -> bot.jumpToAndFire("cancel_ordering", msg)
                else -> {
                    bot.sendMessage(msg.chat.id.toChatId(), "Oops, I don't understand you. Just answer yes or no?")
                    bot.jumpTo("answer_choice", msg)
                }
            }
        }
        .then("order_taxi", isTerminal = true) { msg ->
            bot.sendMessage(msg.chat.id.toChatId(), "Fine! Taxi is coming")
        }
        .then("cancel_ordering", isTerminal = true) { msg ->
            bot.sendMessage(msg.chat.id.toChatId(), "Ok! See you next time")
        }
        .build()

    bot.start()
}
```

## Deployment
Use [ShadowJar](https://github.com/johnrengelman/shadow) plugin or any other way you like.

## [Examples](/examples/src/main/kotlin)
- [Long polling bot](/examples/src/main/kotlin/LongPollingExample.kt)
- [Webhook bot](/examples/src/main/kotlin/WebhookExample.kt)
  and [nginx configuration file](/examples/bot.conf)

## Bot methods
See details in [source code](/library/src/main/kotlin/com/elbekd/bot/Bot.kt).

# License
[MIT License](./LICENSE.md)
