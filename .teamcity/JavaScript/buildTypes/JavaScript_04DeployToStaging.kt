package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object JavaScript_04DeployToStaging : BuildType({
    uuid = "f11bb3d7-1327-4e98-8be4-03f5df77ad96"
    extId = "JavaScript_04DeployToStaging"
    name = "03. Deploy to Staging"

    vcs {
        root(JavaScript.vcsRoots.JavaScript_HttpsGithubComG0t4teamcityCourseCards)

    }
    steps {
        script {
            name = "IIS Deploy"
            id = "RUNNER_6"
            scriptContent = """
rmdir /S /Q \inetpub\wwwroot
xcopy /S /I /Y app \inetpub\wwwroot
            """
        }
    }
    dependencies {
        dependency(JavaScript.buildTypes.JavaScript_02Chrome) {
            snapshot {
            }
        }
        dependency(JavaScript.buildTypes.JavaScript_03Firefox) {
            snapshot {
            }
        }
        triggers {
            vcs {
                id = "vcsTrigger"
            }
        }

    }
})
