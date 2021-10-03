# Answer

The difference beteweene tableswitch and lookupswitch is that:

* **lookupswitch** uses a table with keys and labels

* **tableswitch** uses a table with labels only.

When performing a tableswitch, the int value on top of stack is directly used as an index into the table to grab the jump destination and perform the jump immediately.

When performing a lookupswitch, the value on top of the stack is compared against the keys in the table until a match is found and then the jump destination next to this key is used to perform the jump.
