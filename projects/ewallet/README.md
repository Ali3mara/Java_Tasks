# EWallet

Console wallet app (sign up, log in, balance).

## Layout
- `model/` – data classes (`Account`, `WalletSystem`)
- `service/` – service interfaces; `service/impl/` – implementations

## Build & run
```
mvn compile
mvn exec:java -Dexec.mainClass=com.ali3mara.ewallet.Main
```
