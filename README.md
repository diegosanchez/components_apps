### Apps Components

#### What is a component?

"An individual software component is a software package, a web service, a web resource, or a module that encapsulates a set of related functions (or data)." [Ref Wikipedia][1]

#### DAG

Notice one more thing: Regardless of which component you begin at, it is impossible to follow the dependency relationships and wind up back at that component. This structure has no cycles. It is a directed acyclic graph (DAG).

#### Stability
_Stability_ is related to the amount of work required to make a change. 

#### Further research

**What about checkout?¿**
Answer welcome

**Why review have to know shipping and payment?**
Answer welcome

**Why shouldn't payment render review and congrats?**
Answer welcome

~**Shall we put all functional classes togeather (shipping, payment, etc.)?**~ 
I dont think so! What if QR scanner comes in?

NOTES:
- Dividing functionaly changes in Payment might ripple to Shipment. 


[1]: https://en.wikipedia.org/wiki/Component-based_software_engineering
