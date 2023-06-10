# Pet

Create a new pet in the store


## Fields

| Field                                         | Type                                          | Required                                      | Description                                   | Example                                       |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| `category`                                    | [Category](../../models/shared/Category.md)   | :heavy_minus_sign:                            | N/A                                           |                                               |
| `id`                                          | *Long*                                        | :heavy_minus_sign:                            | N/A                                           | 10                                            |
| `name`                                        | *String*                                      | :heavy_check_mark:                            | N/A                                           | doggie                                        |
| `photoUrls`                                   | List<*String*>                                | :heavy_check_mark:                            | N/A                                           |                                               |
| `status`                                      | [PetStatus](../../models/shared/PetStatus.md) | :heavy_minus_sign:                            | pet status in the store                       |                                               |
| `tags`                                        | List<[Tag](../../models/shared/Tag.md)>       | :heavy_minus_sign:                            | N/A                                           |                                               |