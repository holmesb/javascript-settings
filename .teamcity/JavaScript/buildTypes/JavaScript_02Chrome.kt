package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object JavaScript_02Chrome : BuildType({
    template(JavaScript.buildTypes.JavaScript_Template)
    uuid = "c2f6f2a1-6e69-4c37-b633-260118073d61"
    extId = "JavaScript_02Chrome"
    name = "02. Chrome"


    params {
        param("Browser", "Chrome")
    }

    vcs {
        cleanCheckout = true
    }

    dependencies {
        dependency(JavaScript.buildTypes.JavaScript_01FastTests) {
            snapshot {
            }
        }
    }
})
