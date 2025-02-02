/*
 * Copyright 2022 emo Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
plugins {
    id("emo.android.library")
    id("emo.android.library.compose")
    id("emo.spotless")
    id("emo.publish")
}

version = libs.versions.emoPhoto.get()

android {
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
    namespace = "cn.qhplus.emo.photo"
}
dependencies {
    implementation(libs.androidx.core.ktx)
    api(project(":ui-core"))
    api(project(":fs"))
    implementation(libs.androidx.activity.compose)
    implementation(libs.accompanist.navigation)
    implementation(libs.accompanist.permissions)
    implementation(libs.accompanist.systemuicontroller)
    implementation(libs.androidx.constraintlayout.compose)
}
