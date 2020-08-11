# Coffee Machine

Here lies what remains of a month well spent on JetBrains Academy / Hyperskill. Files were extracted from the content obtained through syncing my account with IntelliJ IDEA.

**Use cases for this repo:** Literally none, just for archival of what was my first interaction with Java.

---

## Folder labeling

- `tasks` folders include original transcript of the presented problem
- `answers` are .java code answers to those problems

## Contents

- `Other tasks / answers`: Stuff that I did directly from the Map feature that is not a part of the Coffee Machine project path

- `Stage tasks / answers`: Versioning of the CoffeeMachine.java by stages

- `CoffeeMachine.java`: Final project result

## Example usage

Predefined initial resources: 400 ml of water, 540 ml of milk, 120 g of coffee beans, 9 disposable cups, $550 in cash. 

The symbol > represents the user input. Notice that it's not the part of the input.

```
Write action (buy, fill, take, remaining, exit): 
> remaining

The coffee machine has:
400 of water
540 of milk
120 of coffee beans
9 of disposable cups
$550 of money

Write action (buy, fill, take, remaining, exit): 
> buy

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: 
> 2
I have enough resources, making you a coffee!

Write action (buy, fill, take, remaining, exit): 
> remaining

The coffee machine has:
50 of water
465 of milk
100 of coffee beans
8 of disposable cups
$557 of money

Write action (buy, fill, take, remaining, exit): 
> buy

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: 
> 2
Sorry, not enough water!

Write action (buy, fill, take, remaining, exit): 
> fill

Write how many ml of water do you want to add: 
> 1000
Write how many ml of milk do you want to add: 
> 0
Write how many grams of coffee beans do you want to add: 
> 0
Write how many disposable cups of coffee do you want to add: 
> 0

Write action (buy, fill, take, remaining, exit): 
> remaining

The coffee machine has:
1050 of water
465 of milk
100 of coffee beans
8 of disposable cups
$557 of money

Write action (buy, fill, take, remaining, exit): 
> buy

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: 
> 2
I have enough resources, making you a coffee!

Write action (buy, fill, take, remaining, exit): 
> remaining

The coffee machine has:
700 of water
390 of milk
80 of coffee beans
7 of disposable cups
$564 of money

Write action (buy, fill, take, remaining, exit): 
> take

I gave you $564

Write action (buy, fill, take, remaining, exit): 
> remaining

The coffee machine has:
700 of water
390 of milk
80 of coffee beans
7 of disposable cups
$0 of money

Write action (buy, fill, take, remaining, exit): 
> exit
```

