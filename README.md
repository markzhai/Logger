# Logger
Logger is a logging tool helps unify release log and debug log, with some little advanced usage.

## Usage
- output to file and logcat with one call.
- hide debug and release difference to developers.
- composition over inheritance, easy to composite own logger. 
- directly log EXCEPTION / ARRAY / MAP / COLLECTION / OBJECT.

## HOW-TO

Logger is easy to use.

```java
public class SampleApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            Logger.init(this, ReleaseLogger.getInstance());
        } else {
            Logger.init(this, ReleaseLogger.getInstance());
        }
    }
}
```

init it in Application, and use Logger to log whatever you want.

```java
Logger.d(TAG, "123");
Logger.d(TAG, this);
Logger.e(TAG, "123", new NullPointerException());
```

You can customize your own DebugLogger and ReleaseLogger by changing the internal composition implementation.