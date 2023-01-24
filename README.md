# Getting Started

## Running locally

* Set up and run local Elasticsearch and Kibana
* import sample data (see below)
* build and run via IDE or `./gradlew bootRun`
* issue GET request (examine `AccountController` for details)

## Sample Elasticsearch request

```json
GET /_cat/indices?v

GET /bank/_search
{
  "query": {
    "match": {
      "state": "CA"
    }
  }
}

GET /bank/_search
{
  "query": {
    "bool": {
      "must": [
        {
          "match": {
            "state": "CA"
          }
        },
        {
          "match": {
            "employer": "Techade"
          }
        }
      ]
    }
  }
}

GET /bank/_search
{
  "query": {
    "bool": {
      "should": [
        { "match": { "state": "CA" } },
        { "match": { "lastname": { "query": "Smith", "boost": 3 } } }
      ]
    }
  }
}

GET /bank/_search
{
  "query": {
    "term": {
      "account_number": {
        "value": "516"
      }
    }
  }
}

GET /bank/_search
{
  "query": {
    "terms": {
      "account_number": [
        "516",
        "851"
      ]
    }
  }
}

GET /bank/_search
{
  "query": {
    "range": {
      "account_number": {
        "gte": 10,
        "lte": 20
      }
    }
  }
}

GET /bank/_search
{
  "size": 0,
  "aggs": {
    "agg_by_state": {
      "terms": {
        "field": "state.keyword"
      }
    }
  }
}

GET /bank/_search
{
  "size": 0,
  "aggs": {
    "agg_by_state": {
      "terms": {
        "field": "state.keyword"
      },
      "aggs": {
        "avg_balance": {
          "avg": {
            "field": "balance"
          }
        },
        "gender": {
          "terms": {
            "field": "gender.keyword"
          },
          "aggs": {
            "gender_avg_balance": {
              "avg": {
                "field": "balance"
              }
            }
          }
        }
      }
    }
  }
}
```

## Importing sample data

Use `accounts.json` from `resources\data`

```json
POST _bulk
{"index":{"_index":"bank","_id":"15"}}
{"account_number":15,"balance":43456,"firstname":"Bobbie","lastname":"Sexton","age":21,"gender":"M","address":"232 Sedgwick Place","employer":"Zytrex","email":"bobbiesexton@zytrex.com","city":"Hendersonville","state":"CA"}
...
...
```

## Useful documentation

* [Spring Data Elasticsearch Reference Documentation](https://docs.spring.io/spring-data/elasticsearch/docs/current/reference/html)

### Tips and Tricks

Before running your Elasticsearch - disable security as SSL is not set for simplicity
```properties
xpack.security.enabled: false
xpack.security.http.ssl.enabled: false
xpack.security.transport.ssl.enabled: false
```
