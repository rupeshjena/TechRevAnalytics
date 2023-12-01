package com.techrev.analytics

import java.sql.DriverManager.println

class Analytics () {

    companion object {
        fun authenticateUser(mAuthKey : String) : String {
            println("User auth key: $mAuthKey");
            return "Your auth key $mAuthKey is authenticated successfully!"
        }
    }

}