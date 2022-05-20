@Suppress("MemberVisibilityCanBePrivate")
object Deps {
    operator fun invoke(block: Deps.() -> Unit) {
        this.block()
    }

    // //////////////////////////////////////////////////////////////////
    const val kotlinVersion = "1.6.21"
    // //////////////////////////////////////////////////////////////////

    // Publishing //////////////////////////////////////////////////////
    // TODO: Upgrade to 0.15.x -> Beware: configuration changes are necessary
    const val mavenPublishVersion = "0.14.2"

    // https://mvnrepository.com/artifact/org.jetbrains.dokka/dokka-gradle-plugin
    // Dokka gradle plugin org.jetbrains.dokka
    const val dokkaVersion = "1.6.21"
    // //////////////////////////////////////////////////////////////////

    // // NPM dependencies /////////////////////////////////////////////////////////////////////////

    // // Test dependencies ////////////////////////////////////////////////////////////////////////

//    object Test {
//
//        operator fun invoke(block: Test.() -> Unit) {
//            this.block()
//        }
//
//        // https://mvnrepository.com/artifact/ch.qos.logback/logback-classic
//        const val logback_version = "1.2.11"
//        const val logback_classic = "ch.qos.logback:logback-classic:$logback_version"
//
//        // https://mvnrepository.com/artifact/io.kotest/kotest-common
//        const val kotest_version = "5.3.0"
//        const val kotest_assertions_core = "io.kotest:kotest-assertions-core:$kotest_version"
//        const val kotest_framework_engine = "io.kotest:kotest-framework-engine:$kotest_version"
//        const val kotest_framework_datatest = "io.kotest:kotest-framework-datatest:$kotest_version"
//
//        const val kotest_runner_junit_jvm = "io.kotest:kotest-runner-junit5-jvm:$kotest_version"
//
//        fun KotlinDependencyHandler.commonTestDeps() {
//            implementation(kotlin("test-common"))
//            implementation(kotlin("test-annotations-common"))
//            implementation(kotest_assertions_core)
//            implementation(kotest_framework_engine)
//            implementation(kotest_framework_datatest)
//        }
//
//        fun KotlinDependencyHandler.jsTestDeps() {
//            implementation(kotest_assertions_core)
//            implementation(kotest_framework_engine)
//            implementation(kotest_framework_datatest)
//        }
//
//        fun KotlinDependencyHandler.jvmTestDeps() {
//            implementation(logback_classic)
//            implementation(kotest_runner_junit_jvm)
//        }
//
//        fun DependencyHandlerScope.jvmTestDeps() {
//            testImplementation(logback_classic)
//            testImplementation(kotest_runner_junit_jvm)
//        }
//
//        fun TaskContainerScope.configureJvmTests(
//            configure: org.gradle.api.tasks.testing.Test.() -> Unit = {}
//        ) {
//            listOfNotNull(
//                findByName("test") as? org.gradle.api.tasks.testing.Test,
//                findByName("jvmTest") as? org.gradle.api.tasks.testing.Test,
//            ).firstOrNull()?.apply {
//                useJUnitPlatform { }
//
//                filter {
//                    isFailOnNoMatchingTests = false
//                }
//
////                testLogging {
////                    showExceptions = true
////                    showStandardStreams = true
////                    events = setOf(
////                        org.gradle.api.tasks.testing.logging.TestLogEvent.FAILED,
////                        org.gradle.api.tasks.testing.logging.TestLogEvent.PASSED
////                    )
////                    exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
////                }
//
//                configure()
//            }
//        }
//    }
}
