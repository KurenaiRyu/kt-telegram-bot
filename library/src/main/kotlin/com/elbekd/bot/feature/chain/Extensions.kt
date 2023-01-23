@file:Suppress("unused")

package com.elbekd.bot.feature.chain

import com.elbekd.bot.Bot
import com.elbekd.bot.types.Message

/**
 * Helper method for creating a [Chain] that is triggered by
 * text message.
 * @param trigger a text from [Message] that triggers this [Chain]
 * @param action an action that is called when [Chain] is triggered
 * @return [ChainBuilder]
 */
public fun Bot.chain(trigger: String, action: suspend (Message) -> Unit): ChainBuilder {
    return ChainBuilder.with(this, trigger, action)
}

/**
 * Helper method for creating a [Chain] that triggered by
 * specified predicate.
 * @param label used just as a name of the chain
 * @param predicate a predicate that fires the chain if returns `true`
 *                  for incoming [Message]. If there are several predicates
 *                  with the same condition only the first one is called
 * @param action an action that will be called when the chain is fired
 * @return [ChainBuilder]
 */
public fun Bot.chain(label: String, predicate: suspend (Message) -> Boolean, action: suspend (Message) -> Unit): ChainBuilder {
    return ChainBuilder.with(this, label, predicate, action)
}

/**
 * Jumps to the specified step of the chain that will be fired
 * for the next incoming [message].
 * @param label label of the step to jump to
 * @param message incoming [Message]
 */
public fun Bot.jumpTo(label: String, message: Message) {
    ChainControllerHolder.controllers[this]?.jumpTo(label, message)
}

/**
 * Jumps to the specified step of the chain will be fired
 * for the current incoming [message]
 * @param label label of the step to jump to
 * @param message incoming [Message]
 */
public suspend fun Bot.jumpToAndFire(label: String, message: Message) {
    ChainControllerHolder.controllers[this]?.jumpToAndFire(label, message)
}

/**
 * Helper method that terminates chain on the current step.
 * @param chatId id of the chat to stop the chain for
 */
public fun Bot.terminateChain(chatId: Long) {
    ChainControllerHolder.controllers[this]?.terminateChain(chatId)
}

internal fun Bot.registerChain(chain: Chain) {
    val controller = ChainControllerHolder.controllers[this]?:ChainController()
    controller.registerChain(chain)
}

internal fun Bot.chainController() = ChainControllerHolder.controllers[this]?:ChainController()
