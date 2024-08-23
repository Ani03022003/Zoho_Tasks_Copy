let questions=[
    {
        question: "A flashing red traffic light signifies that a driver should do what?",
        options:["stop",
                "speed up",
                "proceed with caution",
                "honk the horn"],
        answer: "stop"
      }, {
        question: "A knish is traditionally stuffed with what filling?",
        options:["potato",
                "creamed corn",
                "lemon custard",
                "raspberry jelly"],
        answer: "potato"
      }, {
        question: "A pita is a type of what?",
        options:["fresh fruit",
                "flat bread",
                "French tart",
                "friend bean dip"],
        answer: "flat bread"
      }, {
        question: "A portrait that comically exaggerates a person's physical traits is called a what?",
        options:["landscape",
                "caricature",
                "still life",
                "Impressionism"],
        answer: "caricature"
      }, {
        question: "A second-year college student is usually called a what?",
        options:["sophomore",
                "senior",
                "freshman ",
                "junior "],
        answer: "sophomore"
      }, {
        question: "A student who earns a J.D. can begin his or her career as a what?",
        options:["lawyer",
                "bricklayer",
                "doctor",
                "accountant"],
        answer: "lawyer"
      }, {
        question: "A triptych is a work of art that is painted on how many panels?",
        options:["two",
                "three",
                "five",
                "eight"],
        answer: "three"
      }, {
        question: "According to a famous line from the existentialist play 'No Exit' what is hell?",
        options:["oneself",
                "other people",
                "little made large",
                "hued in green and blue"],
        answer: "other people"
      }, {
        question: "According to a popular slogan, what state should people not 'mess with'?",
        options:["New York",
                "Texas",
                "Montana",
                "Rhode Island"],
        answer: "Texas"
      }, {
        question: "According to a Yale University study, what smell is the most recognizable to American adults?",
        options:["tuna",
                "laundry",
                "popcorn",
                "coffee"],
        answer: "coffee"
    }
];


            // <div class="container">
            //     <div class="quesBox">
            //         <div class="quesNo">Question 1 of 10</div>
            //         <p>1. What is this?</p>
            //         <div class="optionBox">
            //             <div class="options">
            //                 <input type="radio" name="1"><label>Laptop</label>
            //             </div>
            //             <div class="options">
            //                 <input type="radio" name="1"><label>Kooptop</label>
            //             </div>
            //             <div class="options">
            //                 <input type="radio" name="1"><label>Settop</label>
            //             </div>
            //             <div class="options">
            //                 <input type="radio" name="1"><label>Moptop</label>
            //             </div>
            //         </div>
            //     </div>
            // </div>

let quizContainer = document.getElementById('quizContainer');

    questions.forEach((q, index) => {
        let quesBox = document.createElement('div');
        quesBox.className = 'quesBox';

        let quesNo = document.createElement('div');
        quesNo.className = 'quesNo';
        quesNo.innerText = `Question ${index + 1} of ${questions.length}`;

        let quesText = document.createElement('p');
        quesText.innerText = `${index + 1}. ${q.question}`;

        let optionBox = document.createElement('div');
        optionBox.className = 'optionBox';

        q.options.forEach(option => {
            let optionDiv = document.createElement('div');
            optionDiv.className = 'options';

            let optionInput = document.createElement('input');
            optionInput.type = 'radio';
            optionInput.name = `question${index + 1}`;
            
            let optionLabel = document.createElement('label');
            optionLabel.innerText = option;

            optionDiv.appendChild(optionInput);
            optionDiv.appendChild(optionLabel);
            optionBox.appendChild(optionDiv);
        });

        quesBox.appendChild(quesNo);
        quesBox.appendChild(quesText);
        quesBox.appendChild(optionBox);

        quizContainer.appendChild(quesBox);

    });

    let button = document.getElementById("sub");
    button.addEventListener("click",validateQuiz);

    function validateQuiz(){
        console.log("In validate");
        let score=0;
        questions.forEach((item,index) => {
            let selectedOption = document.querySelector(`input[type="radio"][name="question${index+1}"]:checked`);
            if (selectedOption && selectedOption.nextElementSibling.textContent === item.answer) {
                score++;
            }
        });
        displayResult(score);
    }

    function displayResult(score){
        console.log("In display");
        let res=document.getElementById("result");
        res.textContent=`You scored ${score} out of ${questions.length}!`;
    }

