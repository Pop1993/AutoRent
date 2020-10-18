import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InterfaceUIComponent } from './interface-ui.component';

describe('InterfaceUIComponent', () => {
  let component: InterfaceUIComponent;
  let fixture: ComponentFixture<InterfaceUIComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InterfaceUIComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(InterfaceUIComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
