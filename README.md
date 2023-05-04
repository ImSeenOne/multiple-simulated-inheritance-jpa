# multiple-simulated-inheritance-jpa

GET request to `http://localhost:8080/salaries`

Response: 
`
[
    {
        "id": 1,
        "employee": "ertyerty",
        "outcome": {
            "id": 2,
            "type": "salary",
            "remarks": "ertyerty",
            "amount": 4568.369
        }
    },
    {
        "id": 2,
        "employee": "asdasdertyerty",
        "outcome": {
            "id": 3,
            "type": "salary",
            "remarks": "asdasdertyerty",
            "amount": 4.7689568369E7
        }
    }
]
`

GET request to `http://localhost:8080/acquisitions`

Response: 
`
[
    {
        "id": 1,
        "name": "ertyerty",
        "outcome": {
            "id": 1,
            "type": "acquisition",
            "remarks": "ertyerty",
            "amount": 4568.369
        }
    }
]
`


GET request to `http://localhost:8080/outcomes`

Response: 
`
[
    {
        "id": 1,
        "type": "acquisition",
        "remarks": "ertyerty",
        "amount": 4568.369
    },
    {
        "id": 2,
        "type": "salary",
        "remarks": "ertyerty",
        "amount": 4568.369
    },
    {
        "id": 3,
        "type": "salary",
        "remarks": "asdasdertyerty",
        "amount": 4.7689568369E7
    }
]
`
