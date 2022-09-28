package com.elbekd.bot.internal

internal object ApiConstants {
    private const val BASE_URL = "https://api.telegram.org"
    const val API_URL_FORMAT = "$BASE_URL/bot%s"

    const val METHOD_GET_UPDATES = "getUpdates"
    const val METHOD_GET_MY_COMMANDS = "getMyCommands"
    const val METHOD_SET_MY_COMMANDS = "setMyCommands"
    const val METHOD_DELETE_MY_COMMANDS = "deleteMyCommands"
    const val METHOD_SET_WEBHOOK = "setWebhook"
    const val METHOD_DELETE_WEBHOOK = "deleteWebhook"
    const val METHOD_GET_WEBHOOK_INFO = "getWebhookInfo"
    const val METHOD_GET_ME = "getMe"
    const val METHOD_LOGOUT = "logOut"
    const val METHOD_CLOSE = "close"
    const val METHOD_SEND_MESSAGE = "sendMessage"
    const val METHOD_FORWARD_MESSAGE = "forwardMessage"
    const val METHOD_COPY_MESSAGE = "copyMessage"
    const val METHOD_VIDEO_NOTE = "videoNote"
    const val METHOD_SEND_MEDIA_GROUP = "sendMediaGroup"
    const val METHOD_SEND_LOCATION = "sendLocation"
    const val METHOD_EDIT_MESSAGE_LIVE_LOCATION = "editMessageLiveLocation"
    const val METHOD_STOP_MESSAGE_LIVE_LOCATION = "stopMessageLiveLocation"
    const val METHOD_SEND_VENUE = "sendVenue"
    const val METHOD_SEND_CONTACT = "sendContact"
    const val METHOD_SEND_CHAT_ACTION = "sendChatAction"
    const val METHOD_BAN_CHAT_SENDER_CHAT = "banChatSenderChat"
    const val METHOD_UNBAN_CHAT_SENDER_CHAT = "unbanChatSenderChat"
    const val METHOD_GET_USER_PROFILE_PHOTOS = "getUserProfilePhotos"
    const val METHOD_GET_FILE = "getFile"
    const val METHOD_BAN_CHAT_MEMBER = "banChatMember"
    const val METHOD_UNBAN_CHAT_MEMBER = "unbanChatMember"
    const val METHOD_RESTRICT_CHAT_MEMBER = "restrictChatMember"
    const val METHOD_PROMOTE_CHAT_MEMBER = "promoteChatMember"
    const val METHOD_EXPORT_CHAT_INVITE_LINK = "exportChatInviteLink"
    const val METHOD_CREATE_CHAT_INVITE_LINK = "createChatInviteLink"
    const val METHOD_EDIT_CHAT_INVITE_LINK = "editChatInviteLink"
    const val METHOD_REVOKE_CHAT_INVITE_LINK = "revokeChatInviteLink"
    const val METHOD_APPROVE_CHAT_JOIN_REQUEST = "approveChatJoinRequest"
    const val METHOD_DECLINE_CHAT_JOIN_REQUEST = "declineChatJoinRequest"
    const val METHOD_SET_CHAT_PHOTO = "setChatPhoto"
    const val METHOD_DELETE_CHAT_PHOTO = "deleteChatPhoto"
    const val METHOD_SET_CHAT_TITLE = "setChatTitle"
    const val METHOD_SET_CHAT_DESCRIPTION = "setChatDescription"
    const val METHOD_PIN_CHAT_MESSAGE = "pinChatMessage"
    const val METHOD_UNPIN_CHAT_MESSAGE = "unpinChatMessage"
    const val METHOD_UNPIN_ALL_CHAT_MESSAGES = "unpinAllChatMessages"
    const val METHOD_LEAVE_CHAT = "leaveChat"
    const val METHOD_GET_CHAT = "getChat"
    const val METHOD_GET_CHAT_ADMINISTRATORS = "getChatAdministrators"
    const val METHOD_GET_CHAT_MEMBER_COUNT = "getChatMemberCount"
    const val METHOD_GET_CHAT_MEMBER = "getChatMember"
    const val METHOD_SET_CHAT_STICKER_SET = "setChatStickerSet"
    const val METHOD_DELETE_CHAT_STICKER_SET = "deleteChatStickerSet"
    const val METHOD_ANSWER_CALLBACK_QUERY = "answerCallbackQuery"
    const val METHOD_ANSWER_INLINE_QUERY = "answerInlineQuery"
    const val METHOD_WEB_APP_QUERY = "answerWebAppQuery"
    const val METHOD_EDIT_MESSAGE_TEXT = "editMessageText"
    const val METHOD_EDIT_MESSAGE_CAPTION = "editMessageCaption"
    const val METHOD_EDIT_MESSAGE_MEDIA = "editMessageMedia"
    const val METHOD_EDIT_MESSAGE_REPLY_MARKUP = "editMessageReplyMarkup"
    const val METHOD_SEND_STICKER = "sendSticker"
    const val METHOD_GET_STICKER_SET = "getStickerSet"
    const val METHOD_GET_CUSTOM_EMOJI_STICKERS = "getCustomEmojiStickers"
    const val METHOD_UPLOAD_STICKER_FILE = "uploadStickerFile"
    const val METHOD_CREATE_NEW_STICKER_SET = "createNewStickerSet"
    const val METHOD_ADD_STICKER_TO_SET = "addStickerToSet"
    const val METHOD_SET_STICKER_POSITION_IN_SET = "setStickerPositionInSet"
    const val METHOD_DELETE_STICKER_FROM_SET = "deleteStickerFromSet"
    const val METHOD_SET_STICKER_SET_THUMB = "setStickerSetThumb"
    const val METHOD_SEND_GAME = "sendGame"
    const val METHOD_SET_GAME_SCORE = "setGameScore"
    const val METHOD_GET_GAME_HIGH_SCORES = "getGameHighScores"
    const val METHOD_SEND_INVOICE = "sendInvoice"
    const val METHOD_CREATE_INVOICE_LINK = "createInvoiceLink"
    const val METHOD_ANSWER_SHIPPING_QUERY = "answerShippingQuery"
    const val METHOD_ANSWER_PRE_CHECKOUT_QUERY = "answerPreCheckoutQuery"
    const val METHOD_SET_PASSPORT_DATA_ERRORS = "setPassportDataErrors"
    const val METHOD_SEND_POLL = "sendPoll"
    const val METHOD_STOP_POLL = "stopPoll"
    const val METHOD_SET_CHAT_PERMISSIONS = "setChatPermissions"
    const val METHOD_SET_CHAT_ADMINISTRATOR_CUSTOM_TITLE = "setChatAdministratorCustomTitle"
    const val METHOD_DELETE_MESSAGE = "deleteMessage"
    const val METHOD_SEND_DICE = "sendDice"

    const val CHAT_ID = "chat_id"
    const val SENDER_CHAT_ID = "sender_chat_id"
    const val CAPTION = "caption"
    const val PARSE_MODE = "parse_mode"
    const val ENTITIES = "entities"
    const val CAPTION_ENTITIES = "caption_entities"
    const val DISABLE_CONTENT_TYPE_DETECTION = "disable_content_type_detection"
    const val TEXT = "text"
    const val MESSAGE_ID = "message_id"
    const val USER_ID = "user_id"
    const val ONLY_IF_BANNED = "only_if_banned"
    const val INLINE_MESSAGE_ID = "inline_message_id"
    const val REPLY_MARKUP = "reply_markup"
    const val TITLE = "title"
    const val DESCRIPTION = "description"
    const val PAYLOAD = "payload"
    const val PROVIDER_TOKEN = "provider_token"
    const val START_PARAMETER = "start_parameter"
    const val CURRENCY = "currency"
    const val PRICES = "prices"
    const val MAX_TIP_AMOUNT = "max_tip_amount"
    const val SUGGESTED_TIP_AMOUNTS = "suggested_tip_amounts"
    const val DISABLE_NOTIFICATION = "disable_notification"
    const val PROTECT_CONTENT = "protect_content"
    const val REPLY_TO_MESSAGE_ID = "reply_to_message_id"
    const val ALLOW_SENDING_WITHOUT_REPLY = "allow_sending_without_reply"
    const val DURATION = "duration"
    const val PERFORMER = "performer"
    const val WIDTH = "width"
    const val HEIGHT = "height"
    const val SUPPORTS_STREAMING = "supports_streaming"
    const val URL = "url"
    const val CERTIFICATE = "certificate"
    const val IP_ADDRESS = "ip_address"
    const val DROP_PENDING_UPDATES = "drop_pending_updates"
    const val SECRET_TOKEN = "secret_token"
    const val MAX_CONNECTIONS = "max_connections"
    const val ALLOWED_UPDATES = "allowed_updates"
    const val DISABLE_WEB_PAGE_PREVIEW = "disable_web_page_preview"
    const val FROM_CHAT_ID = "from_chat_id"
    const val PHOTO = "photo"
    const val AUDIO = "audio"
    const val DOCUMENT = "document"
    const val VIDEO = "video"
    const val ANIMATION = "animation"
    const val VOICE = "voice"
    const val VIDEO_NOTE = "video_note"
    const val THUMB = "thumb"
    const val MEDIA = "media"
    const val LATITUDE = "latitude"
    const val LONGITUDE = "longitude"
    const val HORIZONTAL_ACCURACY = "horizontal_accuracy"
    const val LIVE_PERIOD = "live_period"
    const val HEADING = "heading"
    const val PROXIMITY_ALERT_RADIUS = "proximity_alert_radius"
    const val ADDRESS = "address"
    const val FOURSQUARE_ID = "foursquare_id"
    const val FOURSQUARE_TYPE = "foursquare_type"
    const val GOOGLE_PLACE_ID = "google_place_id"
    const val GOOGLE_PLACE_TYPE = "google_place_type"
    const val PHONE_NUMBER = "phone_number"
    const val FIRST_NAME = "first_name"
    const val LAST_NAME = "last_name"
    const val VCARD = "vcard"
    const val ACTION = "action"
    const val OFFSET = "offset"
    const val LIMIT = "limit"
    const val FILE_ID = "file_id"
    const val UNTIL_DATE = "until_date"
    const val REVOKE_MESSAGES = "revoke_messages"
    const val CAN_CHANGE_INFO = "can_change_info"
    const val CAN_POST_MESSAGES = "can_post_messages"
    const val CAN_MANAGE_CHAT = "can_manage_chat"
    const val CAN_EDIT_MESSAGES = "can_edit_messages"
    const val CAN_DELETE_MESSAGES = "can_delete_messages"
    const val CAN_MANAGE_VIDEO_CHATS = "can_manage_video_chats"
    const val CAN_INVITE_USERS = "can_invite_users"
    const val CAN_RESTRICT_MEMBERS = "can_restrict_members"
    const val CAN_PIN_MESSAGES = "can_pin_messages"
    const val CAN_PROMOTE_MEMBERS = "can_promote_members"
    const val STICKER_SET_NAME = "sticker_set_name"
    const val CALLBACK_QUERY_ID = "callback_query_id"
    const val SHOW_ALERT = "show_alert"
    const val CACHE_TIME = "cache_time"
    const val INLINE_QUERY_ID = "inline_query_id"
    const val RESULTS = "results"
    const val IS_PERSONAL = "is_personal"
    const val NEXT_OFFSET = "next_offset"
    const val SWITCH_PM_TEXT = "switch_pm_text"
    const val SWITCH_PM_PARAMETER = "switch_pm_parameter"
    const val STICKER = "sticker"
    const val CUSTOM_EMOJI_IDS = "custom_emoji_ids"
    const val NAME = "name"
    const val PNG_STICKER = "png_sticker"
    const val TGS_STICKER = "tgs_sticker"
    const val EMOJI = "emoji"
    const val EMOJIS = "emojis"
    const val CONTAINS_MASKS = "contains_masks"
    const val MASK_POSITION = "mask_position"
    const val POSITION = "position"
    const val GAME_SHORT_NAME = "game_short_name"
    const val SCORE = "score"
    const val FORCE = "force"
    const val DISABLE_EDIT_MESSAGE = "disable_edit_message"
    const val PROVIDER_DATA = "provider_data"
    const val PHOTO_URL = "photo_url"
    const val PHOTO_SIZE = "photo_size"
    const val PHOTO_WIDTH = "photo_width"
    const val PHOTO_HEIGHT = "photo_height"
    const val NEED_NAME = "need_name"
    const val NEED_PHONE_NUMBER = "need_phone_number"
    const val NEED_EMAIL = "need_email"
    const val NEED_SHIPPING_ADDRESS = "need_shipping_address"
    const val SEND_PHONE_NUMBER_TO_PROVIDER = "send_phone_number_to_provider"
    const val SEND_EMAIL_TO_PROVIDER = "send_email_to_provider"
    const val IS_FLEXIBLE = "is_flexible"
    const val SHIPPING_QUERY_ID = "shipping_query_id"
    const val OK = "ok"
    const val SHIPPING_OPTIONS = "shipping_options"
    const val ERROR_MESSAGE = "error_message"
    const val PRE_CHECKOUT_QUERY_ID = "pre_checkout_query_id"
    const val ERRORS = "errors"
    const val QUESTION = "question"
    const val OPTIONS = "options"
    const val PERMISSIONS = "permissions"
    const val CUSTOM_TITLE = "custom_title"
    const val IS_ANONYMOUS = "is_anonymous"
    const val TYPE = "type"
    const val ALLOWS_MULTIPLE_ANSWERS = "allows_multiple_answers"
    const val CORRECT_OPTION_ID = "correct_option_id"
    const val EXPLANATION = "explanation"
    const val EXPLANATION_PARSE_MODE = "explanation_parse_mode"
    const val EXPLANATION_ENTITIES = "explanation_entities"
    const val OPEN_PERIOD = "open_period"
    const val CLOSE_DATE = "close_date"
    const val IS_CLOSED = "is_closed"
    const val COMMANDS = "commands"
    const val SCOPE = "scope"
    const val LANGUAGE_CODE = "language_code"
    const val EXPIRE_DATE = "expire_date"
    const val MEMBER_LIMIT = "member_limit"
    const val CREATES_JOIN_REQUEST = "creates_join_request"
    const val INVITE_LINK = "invite_link"
}
