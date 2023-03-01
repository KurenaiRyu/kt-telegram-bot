package com.elbekd.bot.model

public data class TelegramApiError(val code: Int,
                                   val description: String,
                                   val migrateToChatId: Long?,
                                   val retryAfter: Int?) :
    Exception("Error code: $code. Description: $description") {
}