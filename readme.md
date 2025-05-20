
```markdown
# 🖥️ System Metrics Monitor - Spring Boot

This is a Spring Boot application that exposes system metrics such as CPU load, memory usage, disk usage, uptime, OS information, and more. It leverages [oshi](https://github.com/oshi/oshi) to gather system data and provides it as a RESTful API.

> 🔗 [Project Repository](https://github.com/mahingaRodin/springBoot-sysmonitor)

---

## 📦 Project Structure

```

com.sys.monitor
├── controllers/
│   └── DataController.java      # Handles HTTP requests for system metrics
├── models/
│   ├── System.java              # Represents system metrics data model
│   └── Disk.java                # Represents disk usage model
├── service/
│   └── SysService.java          # Fetches and processes system metrics
└── repository/
└── SysRepo.java             # Stores the system metrics temporarily

```

---

## 🚀 Getting Started

### ✅ Prerequisites

- Java 17+
- Maven or Gradle
- Spring Boot 3.x
- Linux (for extended disk metrics using `df -h`)
- OSHI dependency (`oshi-core`)

---

## 🧪 API Testing with Postman

### Endpoint: `GET /os-metrics`

#### Description:
Fetches the real-time system metrics including memory, CPU load, disk space, OS info, etc.

#### Optional Query Parameter:

| Parameter | Type   | Default | Description               |
|-----------|--------|---------|---------------------------|
| `id`      | String | `noId`  | An optional identifier ID |

#### Sample Request:
```

GET [http://localhost:8080/os-metrics?id=student-PC](http://localhost:8080/os-metrics?id=student-PC)

````

#### Response (Sample):
```json
{
    "cpuLoad": "0.00 %",
    "usedMemory": "6.67 GB",
    "totalMemory": "7.72 GB",
    "freeMemory": "1.05 GB",
    "disks": [
        {
            "name": "C:\\",
            "totalSpace": "653 GB",
            "freeSpace": "214 GB"
        }
    ],
    "osName": "Microsoft Windows 11 build 26100",
    "osVersion": "10.0",
    "osArch": "amd64",
    "cpuName": "12th Gen Intel(R) Core(TM) i7-1255U",
    "mboName": "LENOVO - 21DH",
    "uptime": "00d:03h:05m:37s"
}
````

#### Testing Instructions:

1. Open **Postman**.
2. Create a **GET** request to: `http://localhost:{yourServletPort}/sysData/os-metrics`
3. (Optional) Add a query param `id` with a value, e.g., `yourName-PC`
4. Click **Send**.
5. View the system metrics in the response body.

---

## 🧰 Tech Stack

* **Java 17**
* **Spring Boot 3**
* **OSHI** – Operating System and Hardware Info
* **SLF4J + Logback** – Logging
* **Postman** – API testing

---

## 📁 Disk Metrics Notes

* Disk metrics are collected using both Java's `File` class and Linux `df -h` command.
* Only mount points starting with `/mnt` are included from `df -h`.
* If running on **non-Linux OS**, `df` command results are skipped gracefully.

---

## 🧑‍💻 Author

**Uwonkunda Mahinga Rodin**
📧 [mahingarodin@gmail.com](mailto:mahingarodin@gmail.com)
🔗 GitHub: [mahingaRodin](https://github.com/mahingaRodin)

---

## 📜 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## ❤️ Contribution

Contributions, issues, and feature requests are welcome!
Feel free to fork the repo and submit a pull request.

```

Let me know if you’d like to generate a Postman collection or add usage examples for Docker deployment or systemd auto-start!
```
