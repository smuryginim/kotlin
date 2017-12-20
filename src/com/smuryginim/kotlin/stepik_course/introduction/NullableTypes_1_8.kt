package com.smuryginim.kotlin.stepik_course.introduction

class Client (val personalInfo: PersonalInfo?)
class PersonalInfo (val email: String?)

interface Mailer {
    fun sendMessage(email: String, message: String)
}

class RealMailer : Mailer {
    override fun sendMessage(email: String, message: String){
        println("Message $message for $email received")
    }
}

fun main(args:Array<String>){
    sendMessageToClient(Client(PersonalInfo("sm")), "My msg", RealMailer())
}

fun sendMessageToClient(client: Client?, message: String?, mailer: Mailer) {
    if (client == null || message == null) return
    val personalInfo = client.personalInfo
    val email = personalInfo?.email ?: return
    mailer.sendMessage(email, message)
}