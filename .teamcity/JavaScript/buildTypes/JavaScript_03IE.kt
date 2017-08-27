package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.BuildType

object JavaScript_02IE : BuildType({
    template(JavaScript_Template)
    uuid = "javascript_02ie_uuid"
    extId = "JavaScript_02IE"
    name = "02. IE"

    params {
        param("Browser", "IE")
    }

    dependencies {
        dependency(JavaScript_01FastTests) {
            snapshot {
            }
        }
    }
})