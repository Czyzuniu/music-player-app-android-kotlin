import java.util.Properties

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    flavorDimensions += "environment"

    buildFeatures {
        buildConfig = true
    }

    productFlavors {
        create("dev") {
            dimension = "environment"
            applicationIdSuffix = ".dev"
            versionNameSuffix = "-dev"
            applyEnvToBuildConfig("dev").forEach { key, value ->
                buildConfigField("String", key.toString(), "\"$value\"")
            }
        }

        create("qa") {
            dimension = "environment"
            applicationIdSuffix = ".qa"
            versionNameSuffix = "-qa"
            applyEnvToBuildConfig("qa").forEach { key, value ->
                buildConfigField("String", key.toString(), "\"$value\"")
            }
        }

        create("prod") {
            dimension = "environment"
            applyEnvToBuildConfig("dev").forEach { key, value ->
                buildConfigField("String", key.toString(), "\"$value\"")
            }
        }
    }

    namespace = "com.example.abelandcoleandroidnativeapp"
    compileSdk {
        version = release(36)
    }

    defaultConfig {
        applicationId = "com.example.abelandcoleandroidnativeapp"
        minSdk = 28
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.compose.material3.adaptive.navigation.suite)
    implementation(libs.androidx.navigation.compose)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    debugImplementation(libs.androidx.compose.ui.tooling)
    debugImplementation(libs.androidx.compose.ui.test.manifest)
}
fun applyEnvToBuildConfig(env: String): Properties {
    val props = Properties()
    val file = rootProject.file(".env.$env")
    if (file.exists()) file.inputStream().use { props.load(it) }
    return props
}