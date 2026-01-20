# CURL
curl -X POST http://localhost:8080/risk/evaluate \
-H "Content-Type: application/json" \
-d '{
"sessionFrequency": 6,
"avgDeposit7d": 150,
"avgDeposit30d": 80,
"lossChasing": true
}'


# Doporučená package struktura
cz.ivosahlik.ml
├── controller
├── features
├── model
├── scoring
├── decision
├── intervention
└── audit

# Spring Boot ML Skeleton – ARCHITEKTURA
┌──────────────┐
│  Controller  │  (REST / Kafka listener)
└──────┬───────┘
↓
┌──────────────┐
│ Feature Svc  │  ← feature engineering
└──────┬───────┘
↓
┌──────────────┐
│  ML Model    │  ← inference only
└──────┬───────┘
↓
┌──────────────┐
│ Decision Svc │  ← rules + thresholds
└──────┬───────┘
↓
┌──────────────┐
│ Intervention │  ← actions / side effects
└──────────────┘
