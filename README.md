# CVS Flickr App

## Architecture

This app was implemented by following CLEAN architecture:

1. Data layer: Retrofit + Gson
2. Domain layer: Coroutine 
3. UI layer: 
* MVVM
* LiveData
* Jetpack Compose + Navigation
* Coil
4. Dependency Injection: Dagger 2

## Extra Features Implemented:
1. Security: SSL Pinning
2. Memory leak monitoring: LeakCanary
3. CI/CD: Github action
4. Testing: Unit test

## Future Improvements:
1. Testing: Espresso
2. Health monitoring: Crashlytics / Sentry
3. Analytics: Firebase Analytics / Segment
4. RemoteConfig: Firebase RemoteConfig / Optimizely
5. CI/CD: 
	  *Static code analysis: SonarCube
6. App update (force / optional)
