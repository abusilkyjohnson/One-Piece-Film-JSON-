plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.onepiecefilmsusingjson"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.onepiecefilmsusingjson"
        minSdk = 24
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    buildFeatures{
        dataBinding = true;
    }
}

dependencies {

    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation ("com.squareup.retrofit2:retrofit:(2.9.0)")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    //swipe-to-refresh Layout
     implementation("androidx.swiperefreshlayout:swiperefreshlayout:1.2.0-alpha01")

    //glide
    implementation ("com.github.bumptech.glide:glide:4.16.0")
    annotationProcessor ("com.github.bumptech.glide:compiler:4.16.0")//must be same version a glide
    //Glide includes a flexible API that allows developers to plug in to almost any network stack.
    //It's a very important and very useful library for displaying images, and I use it in my personal applications.



}