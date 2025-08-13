# Sword Fetch (利刃出鞘)
    来如雷霆收震怒，罢如江海凝清光 --《观公孙大娘弟子舞剑器行》 - 杜甫

这是一个使用 Kotlin 编写的、基于 `okhttp3` 的简单 HTTP 请求工具。它借鉴了前端 `fetch` API 的思想，并采用类型安全的 Kotlin DSL 来构建请求。

## 功能

*   支持 GET, POST, PUT, DELETE 等 HTTP 方法。
*   通过优雅的、类型安全的 **Kotlin DSL** 配置请求方法、请求头和请求体。
*   极简的 API 设计，发起 GET 请求仅需一行代码。
*   发起同步 HTTP 请求并直接返回响应体字符串。

## 如何使用

```kotlin
// 简单的 GET 请求
val user = fetch("https://api.github.com/users/octocat")
println(user)

// 使用 DSL 发起复杂的 POST 请求
val postResponse = fetch("https://jsonplaceholder.typicode.com/posts") {
    methods(HttpMethods.post)
    head {
        add("Content-Type", "application/json")
    }
    body("""{ "title": "foo", "body": "bar", "userId": 1 }""")
}
println(postResponse)
```

## 依赖

*   `com.squareup.okhttp3:okhttp:4.12.0` (或更高版本)

## License
<p xmlns:cc="http://creativecommons.org/ns#" >This work is licensed under <a href="https://creativecommons.org/licenses/by-nc-sa/4.0/?ref=chooser-v1" target="_blank" rel="license noopener noreferrer" style="display:inline-block;">CC BY-NC-SA 4.0<img style="height:22px!important;margin-left:3px;vertical-align:text-bottom;" src="https://mirrors.creativecommons.org/presskit/icons/cc.svg?ref=chooser-v1" alt=""><img style="height:22px!important;margin-left:3px;vertical-align:text-bottom;" src="https://mirrors.creativecommons.org/presskit/icons/by.svg?ref=chooser-v1" alt=""><img style="height:22px!important;margin-left:3px;vertical-align:text-bottom;" src="https://mirrors.creativecommons.org/presskit/icons/nc.svg?ref=chooser-v1" alt=""><img style="height:22px!important;margin-left:3px;vertical-align:text-bottom;" src="https://mirrors.creativecommons.org/presskit/icons/sa.svg?ref=chooser-v1" alt=""></a></p>
