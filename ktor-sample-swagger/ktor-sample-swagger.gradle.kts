plugins {
    application
}

fun DependencyHandler.ktor(name: String) =
    create(group = "io.ktor", name = name, version = "1.4.3")

dependencies {
    implementation(project(":ktor-swagger"))
    implementation(ktor("ktor-server-netty"))
    implementation(ktor("ktor-gson"))
    implementation(group = "com.github.ajalt.clikt", name = "clikt", version = "3.0.1")
}

application {
    mainClassName = "de.nielsfalk.ktor.swagger.sample.JsonApplicationKt"
}
