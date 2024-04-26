// Get the filter buttons and cards container
const filterButtons = document.querySelectorAll('.category-button');
const cardsContainer = document.getElementById('cards');

// Add click event listener to filter buttons
filterButtons.forEach(button => {
  button.addEventListener('click', () => {
    // Remove active class from all filter buttons
    filterButtons.forEach(button => {
      button.classList.remove('active');
    });
    // Add active class to clicked filter button
    button.classList.add('active');

    // Filter cards based on category
    const category = button.dataset.category;
    cardsContainer.childNodes.forEach(card => {
      if (card.nodeType === 1) {
        if (category === 'all') {
          card.style.display = 'block';
        } else if (card.classList.contains(category)) {
          card.style.display = 'block';
        } else {
          card.style.display = 'none';
        }
      }
    });
  });
}); 