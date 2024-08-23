- findViewById is a costly operation because it traverses the view hierarchy every time it is called.
- With data binding enabled, the compiler creates references to all views in a `<layout>` that have an id, and gathers them in a Binding object.
- In
  your code, you create an instance of the binding object, and then 
  reference views through the binding object with no extra overhead.
  
  ![](https://video.udacity-data.com/topher/2018/November/5be384c4_4704sc-a-layoutsdata-binding-intro-slide/4704sc-a-layoutsdata-binding-intro-slide.png)