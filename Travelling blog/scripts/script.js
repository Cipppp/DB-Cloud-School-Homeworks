let usersList;
const articleButton = document.getElementById('article_button');
let postsList;


fetch('https://jsonplaceholder.typicode.com/users')
    .then((response) => response.json())
    .then((data) => (usersList = data));

fetch('https://jsonplaceholder.typicode.com/posts')
    .then((response) => response.json())
    .then((data) => (postsList = data));

articleButton.addEventListener('click', () => {
        const mussumIpsum = mIpsum({ pNum: 4 });

        let mainElement = document.querySelector('main');
        let articleElement = document.createElement('article');

        mainElement.appendChild(articleElement);

        let userId = Math.floor(Math.random() * 10 + 1) - 1;
        let postTitleFromUserId;

        for (let p in postsList) {
            if (postsList[p].userId == userId) {
                let postId = Math.floor(
                    Math.random() * (10 * userId - 10 * (userId - 1) + 1) +
                        10 * (userId - 1)
                );
                postTitleFromUserId = postsList[postId].title;
                break;
            }
        }


  let output = `
            <article>
                <h2 class="title">${postTitleFromUserId}</h2>
                <ul class="info__container">
                    <li class="info__item">Destination Europe</li>
                    <li class="info__item">Added by
                        <span class="info__mark">${usersList[userId].name}</span>
                    </li>
                    <li class="info__item">July 01, 2018</li>
                </ul>
                <div class="actions__container">
                    <button type="button" class="actions__btn">Edit</button>
                    <button type="button" class="actions__btn">Delete</button>
                </div>

                <img src="https://picsum.photos/1280/720?dummy=${Math.floor(Math.random() * 100)}" class="hero-image" alt="Random image"/>
                <div class="content__container">
                    ${mussumIpsum}
                </div>
            </article>
  `
       
            articleElement.insertAdjacentHTML('beforeend', output);

        
});

