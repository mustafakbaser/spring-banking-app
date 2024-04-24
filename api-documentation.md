# API Documentation

This API allows you to manage banking operations such as creating accounts, retrieving account information, depositing and withdrawing funds, and deleting accounts.

## Base URL

```
http://localhost:8080/api
```

## Authentication

Authentication is not required for these endpoints.

## Endpoints

### Create Account

Create a new bank account.

- **URL**

  ```
  POST /accounts
  ```

- **Request Body**

  ```json
  {
      "accountOwnerName" : "M. Kürşad",
      "balance" : 22000
  }
  ```

- **Response**

  - **Status Code:** 201 Created
  - **Response Body:**

    ```json
    {
        "id": 12345,
        "accountOwnerName": "M. Kürşad",
        "balance": 22000
    }
    ```

### Get All Accounts

Retrieve a list of all bank accounts.

- **URL**

  ```
  GET /accounts
  ```

- **Response**

  - **Status Code:** 200 OK
  - **Response Body:**

    ```json
    [
        {
            "id": 12345,
            "accountOwnerName": "M. Kürşad",
            "balance": 22000
        },
        {
            "id": 67890,
            "accountOwnerName": "John Doe",
            "balance": 15000
        }
    ]
    ```

### Get Account By Id

Retrieve information for a specific bank account.

- **URL**

  ```
  GET /accounts/{id}
  ```

- **Parameters**
  - `id`: The ID of the account to retrieve.

- **Response**

  - **Status Code:** 200 OK
  - **Response Body:**

    ```json
    {
        "id": 12345,
        "accountOwnerName": "M. Kürşad",
        "balance": 22000
    }
    ```

### Deposit Amount

Deposit funds into a bank account.

- **URL**

  ```
  PUT /accounts/{id}/deposit
  ```

- **Parameters**
  - `id`: The ID of the account to deposit funds into.

- **Request Body**

  ```json
  {
      "amount" : 114000
  }
  ```

- **Response**

  - **Status Code:** 200 OK
  - **Response Body:**

    ```json
    {
        "id": 12345,
        "accountOwnerName": "M. Kürşad",
        "balance": 136000
    }
    ```

### Withdraw Amount

Withdraw funds from a bank account.

- **URL**

  ```
  PUT /accounts/{id}/withdraw
  ```

- **Parameters**
  - `id`: The ID of the account to withdraw funds from.

- **Request Body**

  ```json
  {
      "amount" : 5000
  }
  ```

- **Response**

  - **Status Code:** 200 OK
  - **Response Body:**

    ```json
    {
        "id": 12345,
        "accountOwnerName": "M. Kürşad",
        "balance": 131000
    }
    ```

### Delete Account By Id

Delete a bank account.

- **URL**

  ```
  DELETE /accounts/{id}
  ```

- **Parameters**
  - `id`: The ID of the account to delete.

- **Response**

  - **Status Code:** Account has been deleted! Account ID: {id}

