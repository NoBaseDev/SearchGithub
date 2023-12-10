pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "SearchGithub"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
include(":app")
include(":feature:user")
include(":feature:repo")
include(":feature:search")
include(":core:domain")
include(":core:database")
include(":core:network")
include(":core:data")
include(":core:model")
include(":core:common")
include(":core:ui")
