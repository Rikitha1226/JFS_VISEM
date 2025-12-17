// Auto-calculate total fee
let subjects = document.querySelectorAll(".subject");
let totalBox = document.getElementById("total");


subjects.forEach(item => {
    item.addEventListener("change", () => {
        let total = 0;

        subjects.forEach(sub => {
            if (sub.checked) {
                total += parseInt(sub.value);
            }
        });

        totalBox.innerText = "₹" + total;
    });
});


// Optional: form submit
document.getElementById("regForm").addEventListener("submit", function(e){
    e.preventDefault();
      e.preventDefault();

    let selectedSubjects = [];
    let totalFee = 0;
    //let cnt=0;
    subjects.forEach(sub => {
        if (sub.checked) {
			//cnt++;
            // Get subject name from the label text
            let subjectName = sub.parentElement.innerText.trim();
            selectedSubjects.push(subjectName);

            totalFee += parseInt(sub.value);
        }
    });

    if (selectedSubjects.length === 0) {
        alert("Please select at least one subject.");
        return;
    }

    let studentName = document.getElementById("name").value;
    document.getElementById("resName").textContent = studentName;
    document.getElementById("resTotal").textContent = "₹" + totalFee;

    let courseList = document.getElementById("resCourses");
    courseList.innerHTML = "";

    selectedSubjects.forEach(course => {
        let li = document.createElement("li");
        li.textContent = course;
        courseList.appendChild(li);
    });

    resName.textContent = studentName;
    resTotal.textContent = "₹" + totalFee;

   
    document.getElementById("resultBox").style.display = "block";
    
});
