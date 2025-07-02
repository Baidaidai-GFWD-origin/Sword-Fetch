# Sword Fetch (利刃出鞘)
    来如雷霆收震怒，罢如江海凝清光 --《观公孙大娘弟子舞剑器行》 - 杜甫

这是一个使用 Kotlin 编写的简单 HTTP 请求工具。它利用 `okhttp3` 处理网络请求，并使用 `kotlinx.serialization.json` 解析请求配置。

## 功能

*   支持 GET, POST, PUT, DELETE 等 HTTP 方法。
*   允许通过 JSON 字符串配置请求选项（方法、请求体、请求头 - *注意：目前请求头解析未完全实现，仅设置了 Content-Type*）。
*   发起同步 HTTP 请求并返回响应体字符串。
*   **极大地简化了 HTTP 请求的操作性, 使得 Kotlin 的 HTTP 一键请求成为了可能**

## 依赖
## <p xmlns:cc="http://creativecommons.org/ns#" >This work is licensed under <a href="https://creativecommons.org/licenses/by-nc-sa/4.0/?ref=chooser-v1" target="_blank" rel="license noopener noreferrer" style="display:inline-block;">CC BY-NC-SA 4.0<img style="height:22px!important;margin-left:3px;vertical-align:text-bottom;" src="https://mirrors.creativecommons.org/presskit/icons/cc.svg?ref=chooser-v1" alt=""><img style="height:22px!important;margin-left:3px;vertical-align:text-bottom;" src="https://mirrors.creativecommons.org/presskit/icons/by.svg?ref=chooser-v1" alt=""><img style="height:22px!important;margin-left:3px;vertical-align:text-bottom;" src="https://mirrors.creativecommons.org/presskit/icons/nc.svg?ref=chooser-v1" alt=""><img style="height:22px!important;margin-left:3px;vertical-align:text-bottom;" src="https://mirrors.creativecommons.org/presskit/icons/sa.svg?ref=chooser-v1" alt=""></a></p>
