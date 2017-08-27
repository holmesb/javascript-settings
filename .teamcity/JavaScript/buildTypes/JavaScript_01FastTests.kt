package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object JavaScript_01FastTests : BuildType({
    template(JavaScript.buildTypes.JavaScript_Template)
    uuid = "6f4629b9-2dac-4626-b66b-a5c395a01b5a"
    extId = "JavaScript_01FastTests"
    name = "01. Fast Tests"

    params {
        param("Browser", "PhantomJS")
    }
})
