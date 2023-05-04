# multiple-simulated-inheritance-jpa
<table>
<tr>
<td> Status </td> <td> Response </td>
</tr>
<tr>
<td> <pre>http://localhost:8080/acquisitions</pre> </td>
<td>

```json
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
```

</td>
</tr>
<tr>
<td> <pre>http://localhost:8080/salaries</pre> </td>
<td>

```json
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
```

</td>
</tr>
<tr>
<td> <pre>http://localhost:8080/outcomes</pre> </td>
<td>

```json
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
```

</td>
</tr>
</table>
