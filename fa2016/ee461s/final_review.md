# Final Exam Review

## Agenda

- Sample exam review

- Quiz 5 review

- Open questions

## 1b Locks and Cond Vars

Why should a lock be initialized to 1?

- When you grab the semaphore, you decrement its value. You should start at 1
  so that your first decrement sets the flag to 0.

Check ch.23 in OSTEP book

## 1c

## Deadlock conditions

1. mutual exclusion

2. hold and wait

    - holding one lock and wanting another lock

3. circular wait

    - Two locks are waiting on each other

4. Non-preemption

    - Once someone has a lock, you can't force it to drop the lock

### 2

Three possible solutions. the one not listed in the solution:

```c
// Solution preventing non-preemption deadlock
int acquired = 0;
while (!acquired) {
    pthread_mutex_lock(&A1->lock);
    if (pthread_mutex_trylock(&A2->lock) != 0) {
        pthread_mutex_unlock(&A1->lock);
        // You should add a delay here to prevent livelock
        continue;
    }
    acquire = 1;
}
```

## Concept of atomicity

- In execution context: can't be interrupted

- In persistence context: all or nothing

## Producer consumer problem

See quiz 5 sol'n

## Parent-child problem

See quiz 5 sol'n

## Lock with Queue implementation

In the example containing a queue, flag, and guard,

- The queue stores all the threads waiting on the lock

- The flag indicates whether the lock is actually "locked" or not

- The guard acts as a lock around the queue and flag operations.

    - Note that it *must* be lowered after the lock operation is complete,
      regardless of whether the thread has the lock or not.

# Difference between locks and condition variables

- *Locks* are used when you want to make sure you're the only person in this
  code block.

- *Condition variables* are used when you want to make sure some condition is
  true before continuing on with execution.


## Common Concurrency Problems

- Non-deadlock

    - Atomicity violation

    - Order violation

- Deadlock

    1. Mutual Exclusion

    2. Hold-and-wait

    3. No preemption

    4. Circular wait

    All four of these conditions must exist for a deadlock to occur!
