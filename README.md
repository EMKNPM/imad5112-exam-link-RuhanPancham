[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/92arv5Vv)

write up
Campsite Commander is a mobile app designed to help people with orgainizing their camping equipment for outdoor excursions. The app allows users to add ,view, and organize their items like tents,marshmellos and flashlights. It uses parallel arrays to 
hold the item , uses loops to compute the count of packed items  and includes many screens for a more convenient navigation.  
<img width="473" height="842" alt="image" src="https://github.com/user-attachments/assets/d4ccc2e8-8e69-4c19-a92e-a01e723668ef" />
<img width="486" height="855" alt="image" src="https://github.com/user-attachments/assets/55de227c-c085-46a6-9af4-6c9d4e806214" />
<img width="491" height="852" alt="image" src="https://github.com/user-attachments/assets/131a9760-acbc-4c77-9cb0-7acf3b36f88a" />
<img width="482" height="853" alt="image" src="https://github.com/user-attachments/assets/a6985cd5-ba58-4747-886c-143e0da30cee" />



Pseudocode
Splash screen 

START 

Display Campsite Commander logo 

Display Campsite Commander title 

Wait 3 seconds 

Open Main Screen 

END 

 

Main screen declarations 

DECLARE itemNames ARRAY 

DECLARE categories ARRAY 

DECLARE quantities ARRAY 

DECLARE comments ARRAY 

itemNames ← ["Tent", "Marshmallows", "Flashlight"] 

categories ← ["Shelter", "Food", "Safety"] 

quantities ← [1, 3, 2] 

comments ← ["4-person waterproof", "For S'mores (Mega size)", "Check batteries (AA)"] 

 

Calculate total items packed 

SET totalItems ← 0 

FOR counter ← 0 TO quantities.length - 1 

  totalItems ← totalItems + quantities[counter] 

NEXT counter 

DISPLAY "Total Items Packed: " 

DISPLAY totalItems 

 

Add Gear Button  

WHEN Add Gear Button Clicked 

  INPUT itemName 

  INPUT category 

  INPUT quantity 

  INPUT comment 

  IF itemName = "" THEN 

    DISPLAY "Please enter an item name" 

  ELSE IF category = "" THEN 

    DISPLAY "Please enter a category" 

  ELSE IF quantity <= 0 THEN 

    DISPLAY "Please enter a valid quantity" 

  ELSE 

    ADD itemName TO itemNames 

    ADD category TO categories 

    ADD quantity TO quantities 

    ADD comment TO comments 

    DISPLAY "Gear Added Successfully" 

  ENDIF 

END 

 

View Checklist Button 

WHEN View Checklist Button Clicked 

  Open Detailed View Screen 

END 

 

 

Detailed View Screen  

FOR counter ← 0 TO itemNames.length - 1 

  DISPLAY "Item: " + itemNames[counter] 

  DISPLAY "Category: " + categories[counter] 

  DISPLAY "Quantity: " + quantities[counter] 

  DISPLAY "Comments: " + comments[counter] 

  DISPLAY "---------------------" 

NEXT counter 

 

Back to Base button 

WHEN Back To Base Button Clicked 

  Return To Main Screen 

END 

 

Overall Program Flow 

START 

Display Splash Screen 

Wait 3 Seconds 

Open Main Screen 

Load Sample Data Into Arrays 

Calculate Total Items Using Loop 

Display Total Items Packed 

Allow User To Add Gear 

Allow User To View Checklist 

Allow User To Return To Main Screen 

END 
