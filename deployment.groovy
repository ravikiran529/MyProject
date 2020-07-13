def call(ENV){
    if (ENV == qa) {
        env.BUILD_ENV = "qa"
        env.APPCENTER_APP = "mssapps-5bfk/CNNgo-Android-TV-QA"
        env.APPCENTER_GROUP = "All-users-of-CNNgo-Android-TV-QA"
        env.PLATFORM = "android"
        env.PATH = "${PATH}:${HOME}/sonar-scanner/bin"
    }
    if (ENV == prd){
        env.BUILD_ENV = "prd"
        env.APPCENTER_APP = "mssapps-5bfk/CNNgo-Android-TV-QA"
        env.APPCENTER_GROUP = "All-users-of-CNNgo-Android-TV-QA"
        env.PLATFORM = "android"
        env.PATH = "${PATH}:${HOME}/sonar-scanner/bin"
    }
}    
