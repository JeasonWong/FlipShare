## What's FlipShare ?
It's a cool way to show share widget.

## Demo

![Markdown](https://raw.githubusercontent.com/jeasonwong/FlipShare/master/screenshots/flipshare.gif)

## Usage

step 1. Confirm your parentView to locate the share widget, and then you can custom by yourself.

```java
FlipShareView share = new FlipShareView.Builder(this, mBtnLeftTop)
                        .addItem(new ShareItem("Facebook", Color.WHITE, 0xff43549C, BitmapFactory.decodeResource(getResources(), R.mipmap.ic_facebook)))
                        .addItem(new ShareItem("Twitter", Color.WHITE, 0xff4999F0, BitmapFactory.decodeResource(getResources(), R.mipmap.ic_twitter)))
                        .addItem(new ShareItem("Google+", Color.WHITE, 0xffD9392D, BitmapFactory.decodeResource(getResources(), R.mipmap.ic_google)))
                        .addItem(new ShareItem("http://www.wangyuwei.me", Color.WHITE, 0xff57708A))
                        .setBackgroundColor(0x60000000)
                        .setItemDuration(500)
                        .setSeparateLineColor(0x30000000)
                        .setAnimType(FlipShareView.TYPE_SLIDE)
                        .create();
```
step 2. Recognize some custom Attributes.

**Animation type**

```java
@IntDef(flag = true, value = {TYPE_VERTICLE, TYPE_HORIZONTAL, TYPE_SLIDE})
    public @interface AnimType {
}
   
```

**Builder**

```java
public Builder addItem(ShareItem shareItem) {
    mShareItemList.add(shareItem);
    return this;
}

public Builder addItems(List<ShareItem> list) {
    mShareItemList.addAll(list);
    return this;
}

public Builder setItemDuration(int mils) {
    mMilliSecond = mils;
    return this;
}

public Builder setAnimType(@AnimType int animType) {
    mAnimType = animType;
    return this;
}

public Builder setBackgroundColor(int color) {
    mBgColor = color;
    return this;
}

public Builder setSeparateLineColor(int color) {
    mSeparateLineColor = color;
    return this;
}
```

step 3. Add OnFlipClickListener to get some callback.

```java
share.setOnFlipClickListener(new FlipShareView.OnFlipClickListener() {
    @Override
    public void onItemClick(int position) {
        Toast.makeText(MainActivity.this, "position " + position + " is clicked.", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void dismiss() {
    }
});
```

## Import

Step 1. Add it in your project's build.gradle at the end of repositories:

```gradle
repositories {
    maven {
        url 'https://dl.bintray.com/wangyuwei/maven'
    }
}
```

Step 2. Add the dependency:

```gradle
dependencies {
  compile 'me.wangyuwei:FlipShare:1.0.2'
}
```

### About Me

[Weibo](http://weibo.com/WongYuwei)

[Blog](http://www.wangyuwei.me)

### QQ Group 欢迎讨论

**479729938**

##**License**

```license
Copyright [2016] [JeasonWong of copyright owner]

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```