# FragmentContextivity

A Kotlin extension for Fragment, to easy get the current context/activity supporting < 21 API

# Install

Add to **gradle** in _allprojects_

```
maven { url 'https://jitpack.io' }
```

then add this

```
compile 'com.github.matteocrippa:FragmentContextivity:0.0.2'
```

# Usage
`FragmentContextivity` provide you a new function called `context()`, that provides you automatically the right instance according your API.

Example:

```
this.context()
```
