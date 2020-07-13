def call(ENV){
    if (ENV == qa){
        BUILD_ENV = "qa"
        APPCENTER_APP = "mssapps-5bfk/CNNgo-Android-TV-QA"
        APPCENTER_GROUP = "All-users-of-CNNgo-Android-TV-QA"
        PLATFORM = "android"
        PATH = "${PATH}:${HOME}/sonar-scanner/bin"
    }
    if (ENV === prd){
        BUILD_ENV = "prd"
        APPCENTER_APP = "mssapps-5bfk/CNNgo-Android-TV-QA"
        APPCENTER_GROUP = "All-users-of-CNNgo-Android-TV-QA"
        PLATFORM = "android"
        PATH = "${PATH}:${HOME}/sonar-scanner/bin"
    }
}
