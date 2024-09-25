plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("org.jetbrains.kotlin.kapt")
}

android {
    namespace = "com.example.dogpics"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.dogpics"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
        dataBinding = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    val version_core = "1.13.1"
    val version_coroutine = "1.3.7"
    val version_retrofit_coroutines_adapter = "0.9.2"
    val version_navigation = "2.7.7"
    val version_constraint_layout = "2.1.4"
    val version_gradle = "8.6.1"
    val version_kotlin = "1.9.24"
    val version_lifecycle_extensions = "2.2.0"
    val lifecycle_version = "2.8.2"
    val version_room = "2.6.1"
    val version_appcompat = "1.7.0"
    val version_fragment = "1.8.0"
    val version_retrofit = "2.9.0"
    val version_kotlin_coroutines = "1.8.1"
    val version_moshi = "1.15.1"
    val version_glide = "4.16.0"
    val version_joda = "2.10"
    val version_work = "2.9.0"
    val version_timber = "5.0.1"

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    // Support libraries

    implementation("androidx.appcompat:appcompat:$version_appcompat")
    implementation("androidx.fragment:fragment:$version_fragment")
    implementation("androidx.constraintlayout:constraintlayout:$version_constraint_layout")

    // Android KTX
    implementation("androidx.core:core-ktx:$version_core")

    // Navigation
    implementation("androidx.navigation:navigation-fragment-ktx:$version_navigation")
    implementation("androidx.navigation:navigation-ui-ktx:$version_navigation")

    // Coroutines for getting off the UI thread
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$version_kotlin_coroutines")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:$version_kotlin_coroutines")

    // Retrofit for networking
    implementation("com.squareup.retrofit2:retrofit:$version_retrofit")
    implementation("com.squareup.retrofit2:converter-moshi:$version_retrofit")
    implementation("com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:$version_retrofit_coroutines_adapter")

    // Moshi for parsing the JSON format
    implementation("com.squareup.moshi:moshi:$version_moshi")
    implementation("com.squareup.moshi:moshi-kotlin:$version_moshi")

    // Joda time library for dealing with time
    implementation("joda-time:joda-time:$version_joda")

    // ViewModel and LiveData (arch components)
    implementation("androidx.lifecycle:lifecycle-extensions:$version_lifecycle_extensions")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")

    // Logging
    implementation("com.jakewharton.timber:timber:$version_timber")

    // Glide for images
    implementation("com.github.bumptech.glide:glide:$version_glide")

    // Room database
    implementation("androidx.room:room-runtime:$version_room")
    implementation("com.google.android.gms:play-services-nearby:19.3.0")
    kapt("androidx.room:room-compiler:$version_room")

    // Kotlin Extensions and Coroutines support for Room
    implementation("androidx.room:room-ktx:$version_room")

    // WorkManager
    implementation("androidx.work:work-runtime-ktx:$version_work")
}