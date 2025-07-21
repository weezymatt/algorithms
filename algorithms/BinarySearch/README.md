# Binary search
## Expression derivation
There are two popular expressions for searching the ```mid``` point of the array. The most common expression is:

$$ (hi - lo) / 2 $$

The issue with this expression occurs when the variables ```low``` and ```high``` are very large numbers (i.e., the algorithm searches near the tail end of the array). An alternative solution is:

$$ low + (high - low) / 2 $$

Let's try test the output of both expressions:

```java
int low = 1189012034
int high = 1324095812

int expressionOne = (high + low) / 2 // ==> -890929725
int expressionTwo = low + (high - low) / 2 // ==> 1256553923
```

The first expression, might I add, is intuitive and sensible. However the preferred expressed is the latter option. You may ask, **how do we get from the first expression to the second one?** Well if we do a simple mathematical derivation we can see that the two expressions are equivalent and how one might produce a solution of their own.

Start with the original expression:

```
mid = (hi + lo) / 2
```

The trick is to substitute the ```hi``` variable with something equivalent:
```
hi = lo + (hi - lo)
```

Let's plug in the equivalent variable into the original expression:
``
mid = [ lo + (hi - lo) + lo ] / 2
``

Simplifying the expression:
```
mid = [2 * lo + (hi - lo ) ] / 2
```

Separate the expression into two individual fractions:
```
mid = (2 * lo) / 2 + (hi - lo) / 2
```

Simplify (and done!):
```
mid = lo + (hi - lo) / 2
```

<br>
<br>

The derivation is very simple but what interested me the most was the process to get an alternative expression. I've seen many answers onlines treated the preferred solution *ipso facto* or as a matter of fact. I don't find this particularly helpful and noticed the trick of rewriting crucial in some derivations in computer science or machine learning.