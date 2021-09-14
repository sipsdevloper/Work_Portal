package com.induse.fluper.mendopick.RetrofitService.bean

data class TicketNoModel(
    var message: String?,
    var response: List<Response?>?
) {

    data class Response(
            var __v: Int?,
            var _id: String?,
            var created: Long?,
            var description: String?,
            var reason: String?,
            var reasonId: String?,
            var status: Int?,
            var userId: String?,
            var userName: String?,
            var userType: Int?
    )
}