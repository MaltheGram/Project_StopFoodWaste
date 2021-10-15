# Project_StopFoodWaste

<p>In this project we've focused on conceptualizing the website, rather than the actual factual content. 
With the use of CSS / HTML, Springboot and Thymeleaf we've established a very basic, but intuitive website. </p>

### The folder structure can be seen below:

<details>
  <summary>Click me!</summary>
  
  ![Skærmbillede 2021-10-12 kl  12 04 15](https://user-images.githubusercontent.com/80412524/136940859-d23f7a95-56ea-4657-a6ae-1f941be72fcb.png)

We intended to add all HTML documents filled with text to the textBlock folder. But due to some issues with Thymeleaf and the folder structure that Thymeleaf provides we let those files remain in the templates folder 
  
</details>
<hr>

### Features
Features we've added:
- A navigation bar that is shown on every page, using a thymeleaf fragment.
- A footer with links to each authors Github and direct mail.
- Minor animations.
- Buttons which than reveals text.
- An action page, in which you can sign up for a petition (WIP).
- A generic template controller for the controller class.

Features we intended to add: 
- A food waste tracker in which you could compare with your friends. Reason it wasn't added, was due to time.
- A content carousel on the front page with different pictures. Reason it wasn't added, was to due to complexity and time.

<hr>

The front page in itself is a basic setup.
The front page consist of said navigation bar and footer.

Rest of the content is boxed in, using CSS classes.
```CSS
.box-border {
    border: 6px solid var(--border-color);
    box-sizing: border-box;
    border-radius: 1rem;
    margin: 2rem 0 1rem 0;
    padding: 1rem 2rem;
}
```
The gallery class is used to display the images as intended.
```CSS
.gallery {
    display: flex;
    flex-wrap: wrap;
    justify-content: space-evenly;
}

.gallery img {
    max-height: 10rem;
    padding: .5rem 0;
}
```
<hr>

### Comments about the "Take Action" page

<details>
  <summary>Take Action!</summary>
  
Following the Gestalt Laws, this page is pretty much build up the same way as the front page, to keep the overall website consistent in form of layout and colors.
  
This page has 3 different columns, which is intended to keep different information.
Using CSS, we've ensured that the site is scalable.

<details>
  <summary>CSS here</summary>
  
```CSS
row {
    display: flex;
    flex-direction: row;
}
.row > .col {
    flex-basis: 0;
    flex-grow: 1;

    margin-left: 0.5rem;
    margin-right: 0.5rem;
}
.row > :first-child { margin-left: 0; }
.row > :last-child { margin-right: 0; }
```
</details>
  
   The HTML itself is build up using a ```<div>``` tag which is given a ```box-border``` class and ```col``` class.
   The intention of the ```form``` was to send information from the petition to another page containing all sign ups. Due to complexity and time this has simply    been hard coded to visualize the concept. <br>
   For now, theres just a few  ```<label>``` tags, which is basically just plain text. <br>
   The ```<input>``` tags, is quite intuitive, they give the option to input some text. <br>
   The ```<type>```tag allows the developer to choose what type of input is given. More information on forms can be found [here](https://www.w3schools.com/html/html_forms.asp).
  
  <details> 
  <summary>HTML Here</summary>
    
  ```html
    <div class="col box-border">Campaign here
            <p>
                A few lines about the ongoing campaign to stop food waste
            </p>
        </div>
 
        <div class="col box-border" >Sign up to join the campaign! Submit in the petition below
            <form method="GET" action="/templates/petition_submissions">
                <label for="fName">First name:</label><br>
                <input type="text" id="fName" name="fName" value="Malthe"><br>
                <label for="lName">Last name:</label><br>
                <input type="text" id="lName" name="lName" value="Gram"><br><br>
                <input type="submit" value="Submit">
            </form>
        </div>
    
  ```
</details>
</details>
  <hr>


### Comments about the "Responsibility" page

<details>
    <summary>Responsibility</summary>
    <br>
    The responsibility page was designed to follow the same visual pattern as the other pages, as far as it suited the content. To keep the look of the page consistent with the others, the same CSS class .box-border is used.<br>
    The element that differs from other pages is buttons, which displays the text associated with it on the same page. Inserting content is done by using a short JavaScript segment. <br>
    <br>

<details>
    <summary>HTML and JavaScript here</summary>
    <br>
    The JavaScript function is defined in the head section of the html code. This code is adjusted from internet sources such as this: https://www.w3schools.com/tags/ev_onclick.asp.


```html
<head>
    <script>
        function displayText(page) {
            const xhr = new XMLHttpRequest();
            xhr.open('GET', page, true);
            xhr.onreadystatechange = function () {
                if (this.readyState !== 4) return;
                if (this.status !== 200) return;
                document.getElementById('wot-area').innerHTML = this.responseText;
            };
            xhr.send();
        }
    </script>
</head>
```
<br>
The script is called in the HTML in connection with onclick event. Each button has a reference to an html document, which contains only the associated text.
<br>

```html
            <div id="button-area">

                <button type="button" onclick="displayText('politician.html')">
                    <div class="selection-element-frame">
                        <div class="Politicians"></div>
                        <p>Politicians</p>
                    </div>
                </button>

                <button type="button" onclick="displayText('corporation.html')">
                    <div class="selection-element-frame">
                        <div class="Corporations"></div>
                        <p>Businesses</p>
                    </div>
                </button>

                <button type="button" onclick="displayText('consumer.html')">
                    <div class="selection-element-frame">
                        <div class="Consumers"></div>
                        <p>Consumers</p>
                    </div>
                </button>

            </div>
```

</details>



</details>
  
  <hr>
  
  ### Coments about Info Page
 <details>
    <summary>Info Page</summary>
   
   
  The thoughts behind the info page was to make it simple and straight with facts therefor we have hardcoded the facts. 
    We also wanted to give the info page a simple look and layout to maintain the overall theme of this website in form of layout and colors.
    In the info page the HTML is build up by 3 ```<div>``` tags, where the class ```box-border``` also has been used.   
   
 
   
 <details>
     <summary>Snippit of HTML</summary>
   
   ```html
   <div class="box-border">
        <h3>Yearly food waste in Denmark in %</h3>
        <p>
            Households: 36%<br>
            Retail: 23%<br>
            The food industry: 19% <br>
            Primary production: 14%<br>
            Institutions and commercial kitchens: 4%<br>
            Hotels and Restaurants: 4%<br>
        </p>
    </div>
   ```

   </details>
    
   
   
   <details>
     <summary>Snippit of CSS</summary>
    
   ```CSS  
     .box-border {
    border: 6px solid var(--border-color);
    box-sizing: border-box;
    border-radius: 1rem;
    margin: 2rem 0 1rem 0;
    padding: 1rem 2rem;
}
     
```
     
   </details>
     
   
   </details>

<hr>
   
   # Experience the webiste!
   Experiecne a [demo](https://projectfoodwaste.herokuapp.com/) of our website. It has been deployed through Heruko.  
   
<hr>
  # Authors of this project:
 
  - [@Malthe Gram](https://github.com/MaltheGram)
  - [@simonGr3dal](https://github.com/simongr3dal)
  - [@SirMeows](https://github.com/SirMeows)
  - [@Frederikmahipal](https://github.com/Frederikmahipal)
  
