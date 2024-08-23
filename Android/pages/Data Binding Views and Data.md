- Updating data
  and then updating the data displayed in views is cumbersome and a 
  source of errors. Keeping the data in the view also violates separation 
  of data and presentation.
- Data binding solves both of these problems. You keep data in a data class. You add a `<data>` block to the `<layout>` to identify the data as variables to use with the views. Views reference the variables.
- The compiler generates a binding object that binds the views and data.
- In
  your code, you reference and update the data through the binding 
  object, which updates the data, and thus what is displayed in the view.
- Binding views to data sets a foundation for more advanced techniques using data binding.
  
  ![](https://video.udacity-data.com/topher/2018/November/5be384d1_l2-5203sc-alayoutsdata-binding-data-slide/l2-5203sc-alayoutsdata-binding-data-slide.png)
  
  In
  this exercise you are going to improve the AboutMe app by using data 
  binding instead of findViewById, and use actual data bound to the 
  name_text and nickname_text views to display information.
  
  **Do the following:**
- Enable data binding in your build.gradle file in the app module inside the android section:
  
  ```
  dataBinding {
   enabled = true
  }
  ```
- Wrap all views in activity_main.xml into a `<layout>` tag, and move the namespace declarations into the the `<layout>` tag.
- In MainActivity, create a binding object:
  
  ```
  **private** lateinit **var** binding: ActivityMainBinding
  ```
- In onCreate, use DataBindingUtil to set the content view:
  
  ```
  binding = DataBindingUtil.**setContentView**(**this**, R.layout.activity_main)
  ```
- Use the binding object to replace all calls to findViewById, for example:
  
  ```
  binding.doneButton.setOnClickListener….etc
  ```
  
  **Hint:** You can use apply() in the click handler to make your code more concise and readable.
- Create a data class MyName for the name and nickname.
  
  ```
  data **class** **MyName**(**var** name: **String** = "", **var** nickname: **String** = "")
  ```
- Add a `<data>`
  block to activity_main.xml. The data block goes inside the layout tag 
  but before the view tags. Inside the data block, add a variable for the 
  MyName class.
  
  ```
  <data>
  *<!-- Declare a variable by specifying a name and a data type. -->*
  *<!-- Use fully qualified name for the type. -->*
  <variable
      name="myName"
      type="com.example.android.aboutme.MyName" />
  </data>
  ```
- In 
  name_text, nickname_edit, and nickname_text, replace the references to 
  string text resources with references to the variables, for example>
  
  ```
  android:**text**="@={myName.name}"
  ```
- In MainActivity, create an instance of MyName.
  
  ```
  *// Instance of MyName data class.*
  **private** **val** myName: MyName = MyName("Aleks Haecky")
  ```
- And in onCreate(), set binding.myName to it.
  
  ```
  binding.myName = myName
  ```
- In addNickname, set the value of nickname in myName, call invalidateAll(), and the data should show in your views.
  
  ```
  myName?.nickname = nicknameEdit.text.**toString**()
  *// Invalidate all binding expressions and request a new rebind to refresh UI*
  **invalidateAll**()
  ```
- When you run your code, it should have no errors and look and work exactly the same!