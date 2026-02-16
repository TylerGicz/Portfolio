// scripts/index.js 

//navigate to projects page with button click
document.getElementById('project_button').addEventListener('click', function () {
    window.location.href = 'projects.html';
    console.log("Navigating to projects page");
});

//navigate to projects page with button click
document.getElementById('experience_button').addEventListener('click', function () {
    window.location.href = 'experience.html';
    console.log("Navigating to experience page");
});

//navigate to projects page with button click
document.getElementById('education_button').addEventListener('click', function () {
    window.location.href = 'education.html';
    console.log("Navigating to education page");
});

// Slide-in animation for feature images
const features = document.querySelectorAll('.feature');
const observer = new IntersectionObserver((entries) => {
    entries.forEach(entry => {
        if (entry.isIntersecting) {
            const img = entry.target.querySelector('.feature__image');
            if (img) {
                img.classList.add('animate');
                console.log('Animating image in section:', entry.target.id);
            }
        }
    });
}, { threshold: 0.2, rootMargin: '0px 0px -50px 0px' });

features.forEach(feature => observer.observe(feature));
