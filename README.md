# App Lifecycle Demo App

[![Build Status](https://travis-ci.org/jshvarts/AppLifecycleDemo.svg?branch=master)](https://travis-ci.org/jshvarts/AppLifecycleDemo)

Medium post is here: http://proandroiddev.com/react-to-app-foreground-and-background-events-with-processlifecycleowner-96278e5816fa

## Summary

This project demonstrates using the new [ProcessLifecycleOwner](https://developer.android.com/reference/android/arch/lifecycle/ProcessLifecycleOwner.html) (bundled with [Lifecycle Architecture Components](https://developer.android.com/topic/libraries/architecture/index.html)) to react to foreground and background events.

`ProcessLifecycleOwner` provides lifecycle for the whole application process. For more details, see my post on Medium.

## Use Cases

App is foregrounded. `ProcessLifecycleOwner` notifies the `LifecycleObserver` of `Lifecycle.Event.ON_START`

![App is coming to foreground](images/foreground.png?raw=true)

App is backgrounded. `ProcessLifecycleOwner` notifies the `LifecycleObserver` of `Lifecycle.Event.ON_STOP`

![App is going to background](images/background.png?raw=true)


## License

    Copyright 2017 James Shvarts

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
