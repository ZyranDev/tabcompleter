plugins {
    id("java")
}

group = "dev.zyran.tabcompleter"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://repo.codemc.io/repository/nms")
}

dependencies {
    compileOnly("org.spigotmc:spigot:1.13.2-R0.1-SNAPSHOT")
}
