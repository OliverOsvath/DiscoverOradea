function search(value) {
    if (value.length >= 2) {
        fetch('/search?value=' + value)
            .then(response => response.json())
            .then(data => displayResults(data));
    } else {
        document.getElementById('searchResults').innerHTML = '';
    }
}

function displayResults(results) {
    const searchResults = document.getElementById('searchResults');
    searchResults.innerHTML = '';

    if (results.length === 0) {
        searchResults.innerHTML = '<p>No results found.</p>';
        return;
    }

    for (let i = 0; i < results.length; i++) {
        const result = results[i];
        const item = document.createElement('a');
        item.classList.add('dropdown-item');
        item.textContent = result.name;
        item.href = result.url; // Setează URL-ul corespunzător

        searchResults.appendChild(item);
    }
}