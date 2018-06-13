To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

gradle
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.p4rv3z:MyServices:1.0'
	}
  <h1>To show toast message</h1>
  S.Toast(Context context, String msg)

  
  <h1>To print log: </h1>
  L.d(String msg)
  L.i(String msg)
  L.v(String msg)
  L.e(String msg)
  L.w(String msg)
  
