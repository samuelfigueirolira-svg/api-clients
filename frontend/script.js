const button = document.getElementById("btSignUp");
const nameInput = document.getElementById("name");
const ageInput = document.getElementById("age");
const cpfInput = document.getElementById("cpf");

button.addEventListener("click", function(){
    const client = {
        name: nameInput.value,
        age: Number(ageInput.value),
        cpf: cpfInput.value
    };
    fetch("http://localhost:8080/clients", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(client)
    })
    .then(response => {
        console.log(response);
    });
});

const delButton = document.getElementById("btDelete");
const idDelete = document.getElementById("idDelete");

delButton.addEventListener("click", function(){
    fetch("http://localhost:8080/clients/" + idDelete.value, {
        method: "DELETE"
    })
    .then(response => {
        console.log(response);
    });
})

const clientsDiv = document.getElementById("clients");

fetch("http://localhost:8080/clients")
    .then(response => response.json())
    .then(clients => {
        clients.forEach(client => {
            clientsDiv.innerHTML += `<p>${client.name} - ${client.age} - ${client.cpf}</p>`;
        });
    });
