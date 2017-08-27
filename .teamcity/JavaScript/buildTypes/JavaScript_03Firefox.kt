package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object JavaScript_03Firefox : BuildType({
    template(JavaScript.buildTypes.JavaScript_Template)
    uuid = "c3f8447a-ccf9-4f75-b046-03daf574f3f3"
    extId = "JavaScript_03Firefox"
    name = "02. Firefox"

    params {
        param("Browser", "Firefox")
    }

    dependencies {
        dependency(JavaScript.buildTypes.JavaScript_01FastTests) {
            snapshot {
            }
        }
    }
})
