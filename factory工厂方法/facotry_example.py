class enermy():
    def encouter(self):
        print('this is a default encouter at debug mode!')

class warrior_enermy(enermy):
    name = 'warrior'
    damage = 30
    def encouter(self):
        print(self.name, "enermy make a damge of", self.damage)


class boss_enermy(enermy):
    name = 'boss'
    damage = 100
    def encouter(self):
        print(self.name, "enermy make a damge of", self.damage) 
# 这个方法放到工厂类中会由于unbound，找不到self
def get_warrior_enermy():
    return warrior_enermy()
def get_boss_enermy():
    return boss_enermy()


class enermy_factory():
    enemy_dict = {}
    enemy_dict['warrior'] = get_warrior_enermy
    enemy_dict['boss'] = get_boss_enermy
    def get_enermy(self, type):
        # defualt 的方法
        self.enemy_dict.setdefault(type, None)
        return self.enemy_dict[type]
    



if __name__ == '__main__':
    running_flag = True
    fac = enermy_factory()
    while running_flag:
        u_input = input('please enter warriror/boss to get an enermy, press quit to quit \n')
        if u_input == 'quit':
            running_flag = False
            continue
        enermy_m = fac.get_enermy(u_input)
        if enermy_m is None:
            print("input",u_input, "is not legal!")
        else:
            print("one enermy created!")
            enermy_m().encouter()